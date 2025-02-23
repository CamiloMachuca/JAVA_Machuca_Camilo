
package javadia5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class JavaDia5 {

  
    public static void main(String[] args) {
        
        ArrayList<Doctores> listaDoctor= new ArrayList<>();
        listaDoctor.add(new Doctores("dr camilo Rodrigues",  "Kdx21 cucuta",1, "Especialista", "","A1"));
        listaDoctor.add(new Doctores("dr Jarlen Camargo", "Kdx23 cucuta",1, "Pedriata", "pepito","A1"));
        
        ArrayList<Hospitales> listaHospitales=new ArrayList<>();
        listaHospitales.add(new Hospitales(1, "serinsa", "cucuta"));
        
        ArrayList<Personal> listaPersonal= new ArrayList<>();
        listaPersonal.add(new Personal( "administrador luis alfonzo", "tibu",1,5000,2,"Tecnico administrativo "));
        
        ArrayList<Pacientes> listaPacientes=new ArrayList<>();
        
        ArrayList<Departamentos> listaDepartamentos=new ArrayList<>();
        listaDepartamentos.add(new Departamentos(1, "Anestesiología", 10, 1));
        listaDepartamentos.add(new Departamentos(2, "Cirugía general", 13, 1));
        listaDepartamentos.add(new Departamentos(3, "Cuidados intensivos", 13, 1));

        ArrayList<Pabellon>pabellones=new ArrayList<>();
        pabellones.add(new Pabellon(1, "Pabellón de Infectología", "covid",2,1));
        pabellones.add(new Pabellon(2, "Pabellón de Traumatología", "fractura",10,2));
        pabellones.add(new Pabellon(3, "Pabellón de Cardiología", "infarto",30,3));
        
       
        listaPacientes.add(new Pacientes(LocalDate.of(2021, 12,2), "covid", "Luis Peres", "cucuta", 1,pabellones));


        boolean buclePrincipal=true;
        while (buclePrincipal==true){
        System.out.println("===============");
        System.out.println("MENU PRINCIPAL");
        System.out.println("===============");
        System.out.println("1. Ver doctores");
        System.out.println("2. ver hospitales");
        System.out.println("3. ver personal");
        System.out.println("4. ver pacientes");
        System.out.println("5. ver departamentos");
        System.out.println("6. Añadir un doctor.");
        System.out.println("7. Añadir un paciente");
        System.out.println("8. Añadir un personal");
        System.out.println("9. Editar datos de un paciente ");
        System.out.println("10. Editar datos de un personal");
        System.out.println("11. Eliminar un paciente");
        System.out.println("12. Eliminar un personal");
        System.out.println("13. salir del programa");
        System.out.println("Ingrese la opcion deseada:");
        Scanner teclado=new Scanner (System.in);
        String opcion=teclado.nextLine();
        
        switch (opcion){
            case "1":
                System.out.println("============================================");
                System.out.println("============ Lista de doctores ===========");
                System.out.println("============================================");
                System.out.println("Los doctores son:");
                for (Doctores d: listaDoctor){
                    System.out.println(d);
                    System.out.println("");
                
                } 
                break;
                
            case "2":
                System.out.println("============================================");
                System.out.println("============ Lista de hospitales ===========");
                System.out.println("============================================");
                System.out.println("Los hospitales disponibles son:");
                for (Hospitales h : listaHospitales) {
                    System.out.println(h);
                    System.out.println("");
                    
                }
                break;
                
            case "3":
                System.out.println("============================================");
                System.out.println("============ Lista de personal ===========");
                System.out.println("============================================");
                System.out.println("El personal disponible son:");
                for (Personal p : listaPersonal) {
                    System.out.println(p);
                    System.out.println("");
                    
                }
                break;
                
            case "4":
                System.out.println("============================================");
                System.out.println("============ Lista de pacientes ===========");
                System.out.println("============================================");
                System.out.println("Los pacientes que se encuentran en el hospital son: ");
                for (Pacientes pacien : listaPacientes) {
                    System.out.println(pacien);
                    System.out.println("");
                    
                }
                break;
                
            case "5":
                System.out.println("============================================");
                System.out.println("============ Lista de Departamentos ===========");
                System.out.println("============================================");
                for (Departamentos de: listaDepartamentos){
                    System.out.println(de);
                    System.out.println("");
                }
                break;
                
                
            case "6":
                System.out.println("============================================");
                System.out.println("============ Añadir un Doctor ===========");
                System.out.println("============================================");
                System.out.println("Ingrese los datos del nuevo Doctor");
               
                System.out.println("Ingrese el nombre y el titulo 'Doctor Miguel Rodrigues'");
                String nueNombre=teclado.nextLine();
                System.out.println("Ingrese la direccion:");
                String nueDirecion=teclado.nextLine();
                System.out.println("Ingrese el id del hospital al que pertenece:");
                int nueIdHosp=teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingrese el cargo que ejerce: ");
                String nueCargo=teclado.nextLine();
                System.out.println("Ingrese el nombre del lider:");
                String nueLider=teclado.nextLine();
                System.out.println("Ingrese el nombre del equipo al que pertenece:");
                String nueEquipo=teclado.nextLine();
                
                listaDoctor.add(new Doctores(nueNombre, nueDirecion,nueIdHosp,  nueCargo,  nueLider,nueEquipo));
                break;
                
            case "7":
                System.out.println("============================================");
                System.out.println("============ Añadir un Paciente ===========");
                System.out.println("============================================");
                System.out.println("Ingrese los datos del nuevo Paciente:");
                
                System.out.println("Ingrese el nombre y el titulo 'paciente Miguel Rodrigues'");
                String nueNombreP=teclado.nextLine();
                System.out.println("Ingrese la direccion:");
                String nueDirecionP=teclado.nextLine();
                System.out.println("Ingrese el id del hospital al que pertenece:");
                int nueIdHospP=teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingrese la fecha de nacimiento (YYYY-MM-DD)");
                String nueFechaNacimi=teclado.nextLine();
                LocalDate nuevaFechaNa=LocalDate.parse(nueFechaNacimi);
                System.out.println("Ingrese el diagnostico");
                String nueDiagnostico=teclado.nextLine();
                

                listaPacientes.add(new Pacientes(nuevaFechaNa, nueDiagnostico, nueNombreP, nueDirecionP, nueIdHospP, pabellones));
                System.out.println("Se añadio el nuevo paciente"+ nueNombreP);
                break;
                
            case "8":
                System.out.println("============================================");
                System.out.println("============ Añadir un personal ===========");
                System.out.println("============================================");
                System.out.println("Ingrese los datos del nuevo personal:");
               
                System.out.println("Ingrese el nombre y el titulo 'Personal Miguel Rodrigues'");
                String nueNombrePer=teclado.nextLine();
                System.out.println("Ingrese la direccion:");
                String nueDirecionPer=teclado.nextLine();
                System.out.println("Ingrese el id del hospital al que pertenece:");
                int nueIdHospPer=teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingrese el salario:");
                int nueSalario=teclado.nextInt();
                System.out.println("Ingrese el id del departamento en el que trabajara");
                int nueIdDepart=teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingrese el tipo de trabajo que realiza:");
                String nueTipoTrabaj=teclado.nextLine();
                
                listaPersonal.add(new Personal( nueNombrePer, nueDirecionPer,nueIdHospPer,nueSalario,nueIdDepart,nueTipoTrabaj));
                System.out.println("Se añadio correctamente al nuevo personal"+ nueNombrePer);
                break;
                
            case "9":
                System.out.println("=================================================");
                System.out.println("========= Editar datos de un paciente ========== ");
                System.out.println("=================================================");
                Pacientes pacienteEditar=null;
                System.out.println("Ingrese el id del paciente que deseas editar");
                int idBusqueda=teclado.nextInt();
                teclado.nextLine();
                for (Pacientes p: listaPacientes){
                    if (p.getId()== idBusqueda){
                        pacienteEditar= p;
                        break;
                    }
                }
                
                if(pacienteEditar==null){
                    System.out.println("No se encontro al paciente");
                    break;
                }
                System.out.println("Ingrese los datos del nuevo paciente");
                System.out.println("Ingrese el nombre:");
                String nuevoNombre1=teclado.nextLine();
                pacienteEditar.setNombre(nuevoNombre1);
                System.out.println("Ingrese la nueva direccion");
                String nuevoDireccion1=teclado.nextLine();
                pacienteEditar.setDireccion(nuevoDireccion1);
                System.out.println("Ingrese el nuevo diagnostico");
                String nuevoDiagnostico1=teclado.nextLine();
                pacienteEditar.setDiagnostico(nuevoDiagnostico1);
                System.out.println("Se edito correctamente al paciente");
                break;
                
            case "10":
                System.out.println("=================================================");
                System.out.println("========= Editar datos de un personal ========== ");
                System.out.println("=================================================");
                Personal personalEditar=null;
                System.out.println("Ingrese el id del personal que deseas editar:");
                int idBusqueda2=teclado.nextInt();
                teclado.nextLine();
                for (Personal per: listaPersonal){
                    if (per.getId()== idBusqueda2){
                        personalEditar= per;
                        break;
                    }
                }
                
                if(personalEditar==null){
                    System.out.println("No se encontro al personal");
                    break;
                }
                System.out.println("Ingrese los datos del personal");
                System.out.println("Ingrese el nombre:");
                String nuevoNombre2=teclado.nextLine();
                personalEditar.setNombre(nuevoNombre2);
                System.out.println("Ingrese la nueva direccion");
                String nuevoDireccion2=teclado.nextLine();
                personalEditar.setDireccion(nuevoDireccion2);
                System.out.println("Ingrese el nuevo salario");
                int nuevoSalario=teclado.nextInt();
                teclado.nextLine();
                personalEditar.setSalario(nuevoSalario);
                System.out.println("Ingrese el nuevo id del departamento");
                int nuevoIdDepartamento=teclado.nextInt();
                teclado.nextLine();
                personalEditar.setId_departamento(nuevoIdDepartamento);
                System.out.println("Ingrese el nuevo tipo de trabajo");
                String nuevoTipoTrabajo=teclado.nextLine();
                personalEditar.setTipo_trabajo(nuevoTipoTrabajo);
                System.out.println("Se realizo correctamente los cambios");
                break;
                
            case "11":
                System.out.println("=============================================");
                System.out.println("============ Eliminar un paciente ===========");
                System.out.println("=============================================");
                System.out.println("Ingrese el id del paciente que deseas eliminar:");
                int idPacienEliminar=teclado.nextInt();
                for (int i =0; i<listaPacientes.size(); i++){
                    if (listaPacientes.get(i).id==idPacienEliminar){
                        listaPacientes.remove(i);
                    }
                }
                break;
                
                
            case "12":
                System.out.println("=============================================");
                System.out.println("========== Eliminar un personal =============");
                System.out.println("=============================================");

                System.out.println("Ingrese el id del personal que desea eliminar:");
                int idPersonalElimi=teclado.nextInt();
                for (int i =0; i<listaPersonal.size(); i++){
                    if (listaPersonal.get(i).id==idPersonalElimi){
                        listaPersonal.remove(i);
                    }
                }
                break;
             
                
            case "13":
                System.out.println("========================");
                System.out.println("Se finalizo el programa");
                System.out.println("========================");
                buclePrincipal=false;
                break;
        }
    }
       
    }


    
}
