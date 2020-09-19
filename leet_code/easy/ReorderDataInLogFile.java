public class ReorderDataInLogFile {
    
    public String[] reorderLogFiles(String[] logs) {
        
        Arrays.sort(logs, new Comparator<String>()
                    {
                        @Override
                        public int compare(String log1, String log2)
                        {
                            String[] logsSplit1 = log1.split(" ", 2);
                            String[] logsSplit2 = log2.split(" ", 2);
                            
                            String cont1 = logsSplit1[1];
                            String cont2 = logsSplit2[1];
                            
                            boolean isAlpha1 = !Character.isDigit(cont1.charAt(0));
                            boolean isAlpha2 = !Character.isDigit(cont2.charAt(0));
                            if(isAlpha1 && isAlpha2)
                            {
                                int cmp = cont1.compareTo(cont2);
                                if(cmp!=0)
                                {
                                    return cmp;
                                }
                                return logsSplit1[0].compareTo(logsSplit2[0]);
                            }
                            else if(isAlpha1)
                                return -1;
                            else if(isAlpha2)
                                return 1;
                            return 0;
                        }
                    });
        
        return logs;
        
    }
}
