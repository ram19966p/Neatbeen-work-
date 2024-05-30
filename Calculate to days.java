 static   void  days( String d , JTable jt2 , int row   ){
          
         LocalDate d1 = LocalDate.parse(d);
        
         System.out.println(d1);
               
          
  try{
                 DefaultTableModel model = (DefaultTableModel) jt2.getModel();
                 //   System.out.println(" mai jt2 hu  chal raha hu ");
              ScheduledExecutorService sche = Executors.newScheduledThreadPool(1);
           
                Runnable task = () -> {
                    
                    LocalDate saveDate = LocalDate.parse(d);
                    System.out.println(d);
                    LocalDate newDate = saveDate.plusYears(10);
                    LocalDate currentDate = LocalDate.now();
                int daysLeft = (int) ChronoUnit.DAYS.between(currentDate, newDate);
               
                SwingUtilities.invokeLater(() -> model.setValueAt(daysLeft, row, 7));
               // System.out.println(" Set ho gya hu mai");
                    
        };
 sche.scheduleAtFixedRate(task, 0, 1, TimeUnit.DAYS);         
   }catch(Exception  ex){
System.out.println(ex.getMessage());
} 
          
  }