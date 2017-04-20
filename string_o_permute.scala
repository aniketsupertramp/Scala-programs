object Solution {
    
    import util.control.Breaks._
    import scala.io.Source._

    def main(args: Array[String]) {
        var sc = new java.util.Scanner(System.in);
        
        var t = sc.nextInt();
        
        var i:Int = 0;
       // var a="";
       import scala.collection.mutable.ListBuffer

var s = new ListBuffer[String]()
       //println(ln);
       // val lines = io.Source.stdin.getLines().drop(1)
  //val linePairs = lines.grouped(2).map(_.reverse).toList.mkString("\n");
         while(i<=t)
             {
                 var a = sc.nextLine();
                  s+= a.grouped(2).map(_.reverse).toList.mkString;
              //println(s);
            
           
           // a.zipWithIndex.map(_ => ((_._1),(_._2)))
          
           i+=1
         }
        s.toList.foreach(i=> if(!i.isEmpty)println(i))
        
        
    }
}