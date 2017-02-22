public class Fatorial{
  //versao iterativa do calculo fatorial
  public int calcularFatorialIterativo(int n){
     if(n < 0){
       //erro menor que zero
     }
     if(n != 0){
       int resultado = 1;
       for(int i = 2;i <= n ; i++){
         resultado*=i;
       }
     }
     return resultado;
  }
}