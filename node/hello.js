console.log("Hello inside Node JS");
//console.log(this);
//console.log(window);
//console.log(global);
//console.log(this==global);

let foo="hello foo";
console.log(this);
console.log(global.foo);
console.log(foo);

setTimeout(()=>{
    console.log("After 3 sec "+foo);
},3000)


