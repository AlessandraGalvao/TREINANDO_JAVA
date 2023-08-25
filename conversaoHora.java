class conversaoHora {

    /**
     * @param segundos
     * @return
     */
    public static  String conversao(int segundosT){
        
        int horas, minutos, segundos;
        if  (segundosT%3600 == 0) {
            horas = (int)(segundosT/3600);
            segundos = 0;
            minutos=0;
        }else if (segundosT>=3600){
                horas = (int)(segundosT/3600);
                minutos = (segundosT -(horas*3600))/60;
                segundos = (int)(segundosT -(horas*3600)- (minutos*60));
               
        }else{ 
                horas=0;
                minutos =  (int)(segundosT/60);
                segundos = (int)(segundosT - (minutos*60));
        }
        String retorno= (String)("Horário:"+ horas +":"+ minutos+":"+ segundos);
        return retorno;
    }

    /**
     * @param args
     */
    public static void main (String[]args){
      
        String resp = (conversao(5980));
        System.out.println(resp);
    
    }

    @Override
    public String toString() {
        return "conversaoHora []";
    }

}