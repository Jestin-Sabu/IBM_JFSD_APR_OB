var express = require("express");
var app = express();

var greet = require("./greeting");
app.use("/greet", greet);

app.get("/", (req, res) => {
  res.send("Hello and welcome to Express.js");
});

app.get("/hi/:name", (req, res) => {
  res.send("Hi, " + req.params.name);
});

app.post("/hello", (req, res) => {
  res.send("Hello from Post request");
});

console.log("Express server started @ 9999");
app.listen(9999);
