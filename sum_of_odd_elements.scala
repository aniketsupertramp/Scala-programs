def f(arr:List[Int]):Int = {
   var sum=0
    val l = arr.filter(_%2!=0)
     l.foreach(sum+=_)
       return sum
}
