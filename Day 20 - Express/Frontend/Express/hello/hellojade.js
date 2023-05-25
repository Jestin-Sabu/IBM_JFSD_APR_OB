const express= require('express');
var app=express();

app.set("view engine", "pug");

app.get("/" , (req,res) => res.render("hello"));

app.listen(9000, function(){
    console.log("Express server running on 9000")
});