/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_hannemendoza;
import java.util.Scanner;
import java.util.Random;
public class Examen1P1_HanneMendoza {
static Scanner kore = new Scanner(System.in);
static Random rand = new Random();
    public static void main(String[] args) {
        System.out.println("*********MENU*********");
        System.out.println("1. Fight or Fly");
        System.out.println("2. Tri Fuerza");
        System.out.println("Ingrese la opción: ");
        int opcion = kore.nextInt();
        while(opcion>0 && opcion<3){
            
            switch(opcion){
                
                case 1:
                    System.out.println("Fight of Flight");
                    System.out.println("Ingrese la maestria: ");
                    System.out.println("1. Principiante (0% de hit extra + extra damage)");
                    System.out.println("2. Intermedio (5% de hit extra + extra damage)");
                    System.out.println("3. Experto (15% de hit extra + extra damage)");
                    int modo = kore.nextInt();
                    
                    int distanciatotz = rand.nextInt(30)+15; //distancia principal del zombie
                    int distanciarondz = rand.nextInt(5)+3; // distancia que avanza el zombie por ronda
                    int damage = rand.nextInt(7)+1;
                    int hit_chance = rand.nextInt(100)+1;
                    int balas = 25; //independiente del nivel de experiencia
                    int vidaz = 25;
                    double dificultad = 0.30;
                    //experiencia del jugador
                    double probabilidad_principal = 0.65;
                    double p_principiante = 0.0;
                    double p_intermedio = 0.05;
                    double p_experto = 0.15;  
                    char continuar = 0;

                            while(continuar == 's' && continuar == 'S'){
                                if(modo==1){
                                    System.out.println("El zombie se encuentra a: " + distanciatotz + " metros!");
                                    System.out.println("El jugador cuenta con : " + balas + " balas!");
                                    double p_mod1 = (probabilidad_principal + p_principiante);
                                    double damage_mod1 = p_mod1;
                                    
                                    if(!(distanciatotz == 0)){
                                        if(hit_chance <= probabilidad_principal){
                                            damage_mod1 -= distanciatotz;
                                            balas--;
                                            vidaz--;
                                            System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: " + damage_mod1 + "!" );

                                        }else if (hit_chance > probabilidad_principal){
                                            distanciatotz -= distanciarondz;
                                            balas--;
                                            System.out.println("Ha fallado! El zombie se encuentra a: " + distanciarondz + "metros");

                                        }
                                        System.out.println("Listo para la siguiente ronda? [s/n]: ");
                                        continuar = 0;
                                        if(distanciatotz == 0){
                                            System.out.println("YOU WIN, has logrado vencer al zombie!");
                                        }else{
                                            System.out.println("GAME OVER, la distancia se redujo a 0!");
                                        }

                                    }
                                    if(modo==2){
                                    System.out.println("El zombie se encuentra a: " + distanciatotz + " metros!");
                                    System.out.println("El jugador cuenta con : " + balas + " balas!");
                                    double p_mod2 = (probabilidad_principal + p_intermedio);
                                    double damage_mod2 = p_mod2;

                                        if(!(distanciatotz == 0)){
                                            if(hit_chance <= probabilidad_principal){
                                                damage_mod2 -= distanciatotz;
                                                balas--;
                                                vidaz--;
                                                System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: " + damage_mod2 + "!" );

                                            }else if (hit_chance > probabilidad_principal){
                                                distanciatotz -= distanciarondz;
                                                balas--;
                                                System.out.println("Ha fallado! El zombie se encuentra a: " + distanciarondz + "metros");

                                            }
                                            System.out.println("Listo para la siguiente ronda? [s/n]: ");
                                            continuar = 0; 
                                            if(distanciatotz == 0){
                                                System.out.println("YOU WIN, has logrado vencer al zombie!");
                                            }else{
                                                System.out.println("GAME OVER, la distancia se redujo a 0!");
                                            }
                                        }
                                    if(modo==3){
                                       System.out.println("El zombie se encuentra a: " + distanciatotz + " metros!");
                                       System.out.println("El jugador cuenta con : " + balas + " balas!");
                                       double p_mod3 = (probabilidad_principal + p_experto);
                                       double damage_mod3 = p_mod3;

                                        if(!(distanciatotz == 0)){
                                            if(hit_chance <= probabilidad_principal){
                                                damage_mod3 -= distanciatotz;
                                                balas--;
                                                vidaz--;
                                                System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: " + damage_mod3 + "!" );

                                            }else if (hit_chance > probabilidad_principal){
                                                distanciatotz -= distanciarondz;
                                                balas--;
                                                System.out.println("Ha fallado! El zombie se encuentra a: " + distanciarondz + "metros");

                                            }
                                            System.out.println("Listo para la siguiente ronda? [s/n]: ");
                                            continuar = 0; 
                                            if(distanciatotz == 0){
                                                System.out.println("YOU WIN, has logrado vencer al zombie!");
                                            }else{
                                                System.out.println("GAME OVER, la distancia se redujo a 0!");
                                            }
                                        }
                                    }
                          
                                    }                      
                     
                                    }

                            } 
                            System.out.println("Desea continuar? [s/n]: "); 
                            
                 
                    break;
                
                case 2:
                    trifuerza();
                    break;
                
            }// switch
            
            
        System.out.println("\n*********MENU*********");
        System.out.println("1. Fight or Fly");
        System.out.println("2. Tri Fuerza");
        System.out.println("Ingrese la opción: ");
        opcion = kore.nextInt();
        } // while
    } // metodo
    
    public static void trifuerza(){
        System.out.println("Tri fuerza");
        System.out.println("Ingrese un valor mayor a 20 y que sea par: ");
        int tam = kore.nextInt();
        int mitad = tam/2;
        
        
        while((!(tam > 20) && !(tam % 2 == 0))){
            System.out.println("Tamaño inválido debe ingresar un valor mayor a 20 y que sea par");
            tam = kore.nextInt();
        }
        
        for(int i = 1 ; i <= tam; i++){
            System.out.print(" "); 
            for(int j = 1 ; j <= (i*2)-1  ; j++){
                 System.out.print("*");
            }
          
        System.out.println();    
        }
        
    }// 2 metodo
    
    
}// clase
