def f(arr:List[Int]):List[Int] = {
       
     return arr.zipWithIndex.filter((x) => (x._2%2) == 1).map((x) => x._1);


}