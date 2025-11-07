public class Salario{
    public void pagoTotal(double salarioHoras, double horasTrabajadas, boolean horasExtra){
        double horasNormales = 0;
        double horasExtras = 0;
        String totalHoras;
         if ( horasTrabajadas <=40){
             horasExtras = 0;
             horasNormales = horasTrabajadas;
             System.out.println("El número de horas extra es = " +horasExtras);
         } else{horasNormales = 40;
             horasExtras = horasTrabajadas - horasNormales;
             System.out.println("El número de horas extra es = " +horasExtras);
         }
        System.out.println("El salario por horas normales es = " +salarioHoras*horasTrabajadas);
         double salarioExtra = horasExtras*2*salarioHoras;
        System.out.println("El salario por hora extra es = " +salarioExtra);
        double salarioTotal = salarioExtra+salarioHoras*horasTrabajadas;
        System.out.println("El salario total es = " +salarioTotal);


    }
}