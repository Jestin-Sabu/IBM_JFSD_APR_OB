class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  getName = () => this.name;
  getAge = () => this.age;

  print = () => {
    console.log("Name: " + this.name + "\nAge: " + this.age);
  };
}

module.exports = {Person}
