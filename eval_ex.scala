import scala.math.BigDecimal

object Solution {

    def f1(a:Double,i:Int):Double = {
        var x:Double = a;
        //for(j<-1 to i){x=x*a}
        //return x
        
        if (i == 0) 1 else Math.pow(a, i)
            
    }
    
    def f2(n: Int): Int = n match {
    case 0 => 1
    case _ => n * f2(n-1)
}
    
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        
        var a0 = 0;
        while(a0 < n){
            var x = sc.nextDouble();
            {
                //main logic goes here
                var sum:Double = 1.0000;
                 
              println((List.range(0, 10) map (i => math.pow(x, i)/f2(i))).sum.toFloat)
                  // println(BigDecimal(sum).setScale(4, BigDecimal.RoundingMode.HALF_UP).toDouble) 
                 // println(sum) 
                //println((List.range(0, 10) map (e => math.pow(x, e) / f2(e))).sum.toFloat)
            }
            a0+=1;
            
            
        }
       
      }                    
    
    ////////////////////////////
     
}
