/* 11111111111111111111111111111111111111 */
/* 11111111111111111111111111111111111111 */
function fun1(big) {
    for (var i = 0; i < big.length; i++) {
        if (big[i] > 0) {
            big[i] = "big"
        }
    }
    return big
}

var grande = fun1([-1, 3, 5, -5])
// console.log(grande)



/* 22222222222222222222222222222222222222 */
/* 22222222222222222222222222222222222222 */
function fun2(array) {
    var min = array[0];
    var max = array[0];
    for (var i = 0; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i];
        }
        if (array[i] > max) {
            max = array[i];
        }
    }
    console.log(min)
    return max
}

//var prre = fun2([-1, 3, 5, -5])
//console.log(prre)



/* 333333333333333333333333333333333333333 */
/* 333333333333333333333333333333333333333 */
function fun3(array) {

    var impar = "no hay número impar";
    for (i = 0; i < array.length; i++) {
        if (array[i] % 2 != 0) {
            impar = array[i]
            break
        }
    }

    console.log(array[array.length - 2])

    return impar
}

// var prre2 = fun3([-1, 3, 5, -5])
// console.log(prre2)



/* 444444444444444444444444444444444444444 */
/* 444444444444444444444444444444444444444 */
function fun4(array) {
    doble = []
    for (var i = 0; i < array.length; i++) {
        doble[i] = array[i] * 2;
    }
    return doble
}
var prb = [1, 2, 3];
var dd = fun4(prb);
//console.log(dd);



/* 55555555555555555555555555555555555555 */
/* 55555555555555555555555555555555555555 */
function fun5(array) {
    var cnt = 0;
    for (var i = 0; i < array.length; i++) {
        if (array[i] > 0) {
            cnt = cnt + 1;
        }
    }
    var pos = array;
    pos[array.length - 1] = cnt;
    return pos

}

var cc = [-1, 1, 1, 1];
var contar = fun5(cc);
//console.log(contar);



/* 6666666666666666666666666666666666666666 */
/* 6666666666666666666666666666666666666666 */
function fun6(array) {
    var resp = "no se cumple ninguna condición"
    var m = array;
    for (var i = 0; i < array.length - 2; i++) {
        if (m[i] % 2 != 0 && m[i + 1] % 2 != 0 && m[i + 2] % 2 != 0) {
            /* console.log("¡Qué imparcial!") */
            /* console.log(array[i])
            console.log(array[i + 1])
            console.log(array[i + 2]) */

            resp = "¡Qué imparcial!"

        }
        if (m[i] % 2 == 0 && m[i + 1] % 2 == 0 && m[i + 2] % 2 == 0) {
            /* console.log("¡Es para bien!") */
            /* console.log(array[i])
            console.log(array[i + 1])
            console.log(array[i + 2]) */
            resp = "¡Es para bien!"

        }
    }
    return resp
}

var imparr = fun6([1, 3, 5, 7]);
//console.log(imparr);
var parr = fun6([2, 4, 6, 8]);
//console.log(parr);
var noc = fun6([1, 2, 3, 4]);
//console.log(noc);



/* 77777777777777777777777777777777777777777777777777777 */
/* 77777777777777777777777777777777777777777777777777777 */
function fun7(incr) {
    var arr = incr;
    for (var i = 0; i < incr.length; i++) {
        if (i % 2 != 0) {
            arr[i] = incr[i] + 1;
        }
        console.log(arr[i])
    }

    return arr
}

//var arr = fun7([1, 2, 3, 4, 5]);
//console.log(arr)



/* 888888888888888888888888888888888888888888888888888888 */
/* 888888888888888888888888888888888888888888888888888888 */
function fun8(array) {

    for (var i = array.length - 1; i > 0; i--) {
        array[i] = array[i - 1].length;
    }

    return array
}

var lp = fun8(["programar", "dojo", "genial"])
//console.log(lp);



/* 9999999999999999999999999999999999999999999999999999 */
/* 9999999999999999999999999999999999999999999999999999 */
function fun9(array) {
    var asiete = [];
    for (var i = 0; i < array.length; i++) {
        asiete.push(array[i] + 7)
    }
    return asiete
}

var agrega = [1, 2, 3];
var agregaSiete = fun9(agrega);
// console.log(agrega)
// console.log(agregaSiete)



/* 10-10-10-10-10-10-10-10-10-10-10-10-10-10-10-10-10-10 */
/* 10-10-10-10-10-10-10-10-10-10-10-10-10-10-10-10-10-10 */
function fun10(array) {
    for (var i = 0; i < array.length / 2; i++) {
        var swap = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = swap;
    }

    return array
}

var inver = [2, 4, 6, 1, 3];
//console.log(fun10(inver))



/* 11-11-11-11-11-11-11-11-11-11-11-11-11-11-11-11-11-11 */
/* 11-11-11-11-11-11-11-11-11-11-11-11-11-11-11-11-11-11 */
function fun11(array) {
    nn = []
    for (var i = 0; i < array.length; i++) {
        if (array[i] > 0) {
            nn[i] = -array[i]
        }
        else {
            nn[i] = array[i]
        }
    }

    return nn
}

var per = [1, -3, 5];
var neg = fun11(per);
// console.log(per)
// console.log(neg)



/* 12-12-12-12-12-12-12-12-12-12-12-12-12-12-12-12 */
/* 12-12-12-12-12-12-12-12-12-12-12-12-12-12-12-12 */
function fun12(array) {
    var cont = 0;
    for (var i = 0; i < array.length; i++) {
        if (array[i] == "comida") {
            console.log("yummy")
            cont = cont + 1;

        }

    }
    if (cont == 0) {
        console.log("tengo hambre")
    }
}

var co = ["comida", "hola", "comida", "escala"]
var noco = ["estudiante", "hola", "ver", "escala"]
// var ym = fun12(co)
// var nym = fun12(noco)



/* 13-13-13-13-13-13-13-13-13-13-13-13-13-13-13-13-13 */
/* 13-13-13-13-13-13-13-13-13-13-13-13-13-13-13-13-13 */
function fun13(array) {
    var temp = array[0];
    array[0] = array[array.length - 1]
    array[array.length - 1] = temp

    var temp2 = array[2]
    array[2] = array[array.length - 3]
    array[array.length - 3] = temp2

    return array
}

var camb = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12];
//console.log(fun13(camb))



/* 14-14-14-14-14-14-14-14-14-14-14-14-14-14-14-14-14-14 */
/* 14-14-14-14-14-14-14-14-14-14-14-14-14-14-14-14-14-14 */
function fun14(arr, num) {
    for (var i = 0; i < arr.length; i++) {
        arr[i] = arr[i] * num
    }

    return arr
}

var mu = [1, 2, 3];
var nu = 3;
var mult = fun14(mu, nu);
//console.log(mult)
