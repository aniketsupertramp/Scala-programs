object Solution {
    
    def mingle(a: String, b: String): String = {
    
     
        (a,b).zipped.map((x,y)=>(x+""+y)).mkString;
        
}

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var a = sc.nextLine();
        var b = sc.nextLine();
        
       // var a = readLine();
       // var b = readLine();
        
       // println(a+" "+b);
        
       //var c = a.concat(b);
        println(mingle(a,b));
        
        
    }
}