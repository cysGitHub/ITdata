public static double add(double amount,int i){
        if(i <= 0){
            return amount;
        }
        i--;
         
        BigDecimal b1 = new BigDecimal(amount);
        BigDecimal b2 = b1.multiply(new BigDecimal(0.1));
        BigDecimal b3 = b1.add(b2);
        return add(b3.doubleValue(),i);
    }
     
    public static double subtract(double amount,int i){
        if(i <= 0){
            return amount;
        }
        i--;
        BigDecimal b1 = new BigDecimal(amount);
        BigDecimal b2 = b1.multiply(new BigDecimal(0.1));
        BigDecimal b3 = b1.subtract(b2);
        return subtract(b3.doubleValue(),i);
    }