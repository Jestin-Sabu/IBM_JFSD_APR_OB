var express=require('express');
var router=express.Router();


router.get('/', function(req,res){
    res.send('Bonjour le Monde');
});

router.get('/hola',function(req,res){
    res.send("Hola Amigo, como estas");
})

module.exports=router;