import scala.io.Source
object Solution {
    

    def main(args: Array[String]) {
        
        var sc  = new java.util.Scanner(System.in)
        
        var t = sc.nextInt()
          
        var i:Int = 0 
            
        while(i<=t)
            {
            var s = sc.nextLine()
                var s1 = s
              //  println(s.length)
                var l = s.length
                //println(l);
            if(l>0)
                {
                var lastchar = s.charAt(0);
                
               // println(lastchar)
                
                s = s.drop(1)
                s = s + lastchar
                    
                  //  println(s)
                    while(l>1)
                    {
                     print(s)
                         print(" ")
                         
                    lastchar = s.charAt(0);
                     s = s.drop(1)
                s = s + lastchar
                     
                         l-=1
                        
                }
                    
                   println(s) 
            }
                
                
            
                
                
                
                //while(s)
                
                
                
              i=i+1  
        }
    }
}