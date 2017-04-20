def f(arr:List[Int]):List[Int] = __________________
{ var i=0;
  var l = length(arr);
   while(i<l-1)
       {
       var temp = arr(i);
       arr(i) = arr(l-1);
       arr(l-1) = temp;
       i++;
       l--;
       
   }
 arr;
}