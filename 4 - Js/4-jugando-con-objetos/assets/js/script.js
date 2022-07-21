var users = [{ name: "Michael", age: 37 }, { name: "John", age: 30 }, { name: "David", age: 27 }];

/* 1111111111 */
console.log("edad de John: " + users[1].age)

/* 222222222222 */
console.log("nombre del primer objeto: " + users[0].name)

/* 33333333333 */

for (var i = 0; i < users.length; i++) {
    console.log(users[i].name + " - " + users[i].age)
}

for (var i = 0; i < users.length; i++) {
    if (users[i].age >= 18) {
        console.log(users[i].name, " es mayor de edad")
    }
}