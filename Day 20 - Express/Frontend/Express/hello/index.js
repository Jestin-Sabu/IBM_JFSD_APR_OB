var express=require('express');
var app=express();

var greet=require('./greeting');
app.use('/greet', greet);


app.get('/', function(req,res){
    res.send("Hello and Welcome to Express.js");
});

app.get('/hi/:name', function(req,res){
    res.send("Hi, "+ req.params.name);
});

app.get('/html',function(req,res){
    res.send("<h1>HTML: Welcome to Express.js");
});

app.post('/hello',function(req,res)
{
    res.send("Hello from post request");
});

app.all("/hey",function(req,res){
    res.send("Hey there, Any http method");
});


console.log("Express server starts @ 9999");
app.listen(9999);