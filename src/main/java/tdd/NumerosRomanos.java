package tdd;

public class NumerosRomanos {

    //Implementacion para 1
/*    public String convertirARomano(int natural) {
        return "I";
    }*/

    //Primera implementacion para 2
/*    public String convertirARomano(int natural) {
        if(natural == 1)
            return "I";
        else return "II";
    }*/

    //Refactorizamos implementacion para 2, nos sirve para 3
/*    public String convertirARomano(int natural) {
        String resultado = "";
        for(int i = 0; i < natural; i++){
            resultado += "I";
        }
        return resultado;
    }*/

    //Implementación para 4 y 5
/*    public String convertirARomano(int natural) {
        String resultado = "";

        if (natural <= 3)
            for (int i = 0; i < natural; i++)
                resultado += "I";

        switch (natural) {
            case 4: return "IV";
            case 5: return "V";
        }
        return resultado;
    }*/

    //Implementación 6 y 7
/*    public String convertirARomano(int natural) {
        String resultado = "";

        if (natural <= 3)
            for (int i = 0; i < natural; i++)
                resultado += "I";

        switch (natural) {
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
        }
        return resultado;
    }*/

    //Refactorizacion final
/*    public String convertirARomano(int natural) {
        if(natural == 4)
            return "IV";
        if(natural <= 3)
            return this.composicion(natural,"");
        else return this.composicion(natural,"V");
    }

    private String composicion(int natural, String principio){
        for(int i = 0; i < natural%5; i++)
            principio += "I";
        return principio;
    }*/

}
