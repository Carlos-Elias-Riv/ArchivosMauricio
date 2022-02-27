/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author cerivera
 */
public class Empresa {
    private String nomEmpresa;
    private String direccion;
    private String nomDuenio;
    private Empleado[] empleados;
    private int tE;
    
    public Empresa(){
        tE= 0;
        empleados = new Empleado[5];
    }
    
    public Empresa(String nombreEmpresa, String direc, String nombreDuenio){
        this();
        nomEmpresa = nombreEmpresa;
        direccion = direc;
        nomDuenio = nombreDuenio;
    }
    
    
    
    public boolean altaEmpleado(String nombre, double sueldo, int horas){ // esto es para operarios
        boolean resp = false;
        if(tE < 5){ // 5 porque ese fue el valor que estoy controlando
            Operario nuevo = new Operario(nombre, sueldo, horas);
            empleados[tE] = nuevo;
            tE +=1;
            resp = true;
        }
        
        return resp;
    }
    
    public boolean altaEmpleado(String nombre, double sueldo, String dept, String telefono){ // esto es para administrativos
        boolean resp = false;
        
        if(tE < 5){
            Administrativo nuevo = new Administrativo(nombre, sueldo, dept, telefono);
            empleados[tE] = nuevo;
            tE+=1;
            resp = true;
        }
        
        return resp;
    }
    

    private int buscaEmpleado(Empleado dato){
        int i =0;

        int res=-1;
        while(i< tE && !empleados[i].equals(dato))
            i++;
        if(i<tE)
            res = i;

        return res;
    }
    
    @Override
    public String toString(){ 
       
        StringBuilder bobthebuilder = new StringBuilder();
        bobthebuilder.append("\nEste es el reporte de la empresa: ").append("\n");

        for(int j =0; j<tE; j++)
            bobthebuilder.append(empleados[j].toString()).append("\n");
        
        bobthebuilder.append(nomEmpresa).append("-- ").append(direccion).
                append("-- ").append(nomDuenio);
        return bobthebuilder.toString();
                
    }
    
    public String reporteAdministrativoSueldoBase(){
        StringBuilder bobthebuilder = new StringBuilder();
        bobthebuilder.append("Los administrativos que tengo tienen los siguientes sueldosBase: ").append("\n");
        for(int i =0; i< tE; i++)
            if(empleados[i] instanceof Administrativo)
                bobthebuilder.append(empleados[i].nombreYSueldo()).append("\n");
        
        return bobthebuilder.toString();
        
    }

    private String reporteAdministrativoUOperario(String nomClass){
        StringBuilder bobthebuilder = new StringBuilder();
        bobthebuilder.append("Los " + nomClass +  " que tengo tienen los siguientes sueldosBase: ").append("\n");
        for(int i =0; i< tE; i++)
            if (empleados[i].getClass().getSimpleName().equalsIgnoreCase(nomClass)) {
                bobthebuilder.append(empleados[i].nombreYSueldo()).append("\n");
            }
        return bobthebuilder.toString();
    }

    public String generaReporteAdministrativo(){
        return reporteAdministrativoUOperario("Administrativo");
    }

    public String generaReporteOperario(){
        return reporteAdministrativoUOperario("Operario");
    }


    
    
    public boolean actualizarSueldoAdmin(int clave, double percent){
        Administrativo busca = new Administrativo(clave);
        int pos = buscaEmpleado(busca);
        boolean resp = pos>=0;
        if(pos >= 0)
            if(empleados[pos] instanceof Administrativo)
                empleados[pos].ajustaSueldo(percent);

        
        return resp;
    }
    
    public boolean cambioDept(int clave, String dept){
        Administrativo busca = new Administrativo(clave);
        int pos = buscaEmpleado(busca);
        boolean resp = pos>=0;
        if(pos >= 0)
            if(empleados[pos] instanceof Administrativo)
                ((Administrativo)empleados[pos]).setDept(dept);

        
        return resp;
    }
    
    public double pagoMesOperario(int clave, double prestac, double deduc, double precioHE){
        double resp = 0;
        Operario busca = new Operario(clave);
        int pos = buscaEmpleado(busca);

        
        if(pos >=0 )
            if(empleados[pos] instanceof Operario)
                resp = ((Operario)empleados[pos]).calculaSalario(prestac, deduc, precioHE);
        
        return resp;
    }
    
    public String operariosSueldoMenorA(double parametro){
        StringBuilder bobthebuilder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < tE; i++) {
            if (empleados[i] instanceof Operario)
                if (empleados[i].getSueldoBase() < parametro) {
                    count += 1;
                    bobthebuilder.append("\n").append(empleados[i].getNombreEmpleado());
                }

        }
        bobthebuilder.append("\nEl total de operarios que cumplian la condicion es: ").append(count);
        
        return bobthebuilder.toString();
        
    }

    public String salarioAdministradores(double deduc, double aport){
        StringBuilder bobthebuilder = new StringBuilder();
        bobthebuilder.append("\nEl salario de los administradores, suponiendo que todos tienen lo mismo de deducciones" +
                " y aportaciones, es el siguiente: ").append("\n");
        double totalNomica =0;
        for(int i =0; i< tE; i++){
            if (empleados[i] instanceof Administrativo) {
                bobthebuilder.append(empleados[i].calculaSalario(aport, deduc)).append("\n");
                totalNomica+= empleados[i].calculaSalario(aport, deduc);
            }
        }


        return bobthebuilder.toString() + "- y el total de nomica es: " + totalNomica;
    }
    
    
    
    
}
