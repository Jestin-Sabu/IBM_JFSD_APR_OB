const express= require('express');
var app=express();

app.set("view engine", "pug");

app.get("/", (req,res)=> res.render("login"));

app.use(express.urlencoded({extended:true}));

app.post('/login', (req,res)=>{
    var params=req.body;
    res.render('loginresp', {
        name: params.name,
        age: params.age,
        city: params.city
    });
});

app.listen(9000);