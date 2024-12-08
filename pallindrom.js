let n=121;
let a;
let s = 0;
let n1=n;
while( n!=0){
    a= n%10;
        
    s= s * 10 + a;
    n=Math.floor(n/10);

}
if(n1===s){
    console.log("yes");
}
else{
    console.log("not");
}
