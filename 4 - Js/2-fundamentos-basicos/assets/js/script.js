/* 11111111111111111111111111111111111111 */
/* 11111111111111111111111111111111111111 */
function fun1() {
    var arr = [];
    for (var i = 1; i <= 255; i++) {
        arr.push(i);
    }
    return arr;
}

var arr255 = fun1();
//console.log(arr255)



/* 222222222222222222222222222 */
/* 222222222222222222222222222 */
function fun2() {
    var sum = 0;
    for (var i = 1; i <= 1000; i++) {
        if (i % 2 == 0) {
            sum = sum + i;
        }
    }
    return sum;
}

var sumapares = fun2();
//console.log(sumapares)



/* 3333333333333333333333333333333333 */
/* 3333333333333333333333333333333333 */
function fun3() {
    var sum = 0;
    for (var i = 1; i <= 5000; i++) {
        if (i % 2 != 0) {
            sum = sum + i;
        }
    }
    return sum;
}

var sumaimpares = fun3();
//console.log(sumaimpares)



/* 444444444444444444444444 */
/* 444444444444444444444444 */
function fun4(arrsum) {
    var sum = 0;
    for (var i = 0; i < arrsum.length; i++) {
        sum = sum + arrsum[i]
    }
    return sum;
}

var probando1 = fun4([1, 2, 5])
//console.log(probando1)
var probando2 = fun4([-5, 2, 5, 12])
//console.log(probando2)



/* 55555555555555555555555555 */
/* 55555555555555555555555555 */
function fun5(arrmax) {
    var max = arrmax[0];
    for (i = 0; i < arrmax.length; i++) {
        if (arrmax[i] > max) {
            max = arrmax[i];
        }
    }
    return max
}

var probando3 = fun5([-3, 3, 5, 7]);
//console.log(probando3)



/* 66666666666666666666666666666666 */
/* 66666666666666666666666666666666 */
function fun6(arrprom) {
    var sum = 0;
    for (var i = 0; i < arrprom.length; i++) {
        sum = sum + arrprom[i];
    }
    return sum / arrprom.length

}

var probando4 = fun6([1, 3, 5, 7, 20]);
//console.log(probando4)



/* 77777777777777777777777777777777777 */
/* 77777777777777777777777777777777777 */
function fun7() {
    var impar = [];
    for (var i = 1; i <= 50; i++) {
        if (i % 2 != 0) {
            impar.push(i)
        }
    }
    return impar
}

var impares = fun7();
//console.log(impares)



/* 8888888888888888888888888888888888888 */
/* 8888888888888888888888888888888888888 */
function fun8(y, array) {

    var mayor = []
    var cont = 0;
    for (i = 0; i < array.length; i++) {
        if (array[i] > y) {
            mayor.push(array[i])
            cont = cont + 1;
        }
    }
    console.log("hay " + cont + " números mayores que " + y + ", estos son: " + mayor)

}

//var probando5 = fun8(3, [1, 3, 5, 7]);




/* 99999999999999999999999999999999999 */
/* 99999999999999999999999999999999999 */
function fun9(cuad) {
    for (var i = 0; i < cuad.length; i++) {
        cuad[i] = cuad[i] * cuad[i]
    }
    return cuad
}

var probando6 = fun9([1, 5, 10, -2]);
//console.log(probando6)



/* 10-10-10-10-10-10-10-10-10-10-10-10-10 */
/* 10-10-10-10-10-10-10-10-10-10-10-10-10 */
function fun10(neg) {
    for (var i = 0; i < neg.length; i++) {
        if (neg[i] < 0) {
            neg[i] = 0
        }
    }
    return neg
}

var probando7 = fun10([1, 5, 10, -2])
//console.log(probando7)



/* 11-11-11-11-11-11-11-11-11-11-11-11-11 */
/* 11-11-11-11-11-11-11-11-11-11-11-11-11 */
function fun11(mma) {
    var max = mma[0];
    var min = mma[0];
    var sum = 0;
    for (i = 0; i < mma.length; i++) {
        if (mma[i] > max) {
            max = mma[i];
        }
        if (mma[i] < min) {
            min = mma[i];
        }
        sum = sum + mma[i];

    }
    return [max, min, sum / mma.length]

}


var probando8 = fun11([1, 5, 10, -2]);
//console.log(probando8)



/* 12-12-12-12-12-12-12-12-12-12-12-12 */
/* 12-12-12-12-12-12-12-12-12-12-12-12 */

function fun12(dojo) {
    for (i = 0; i < dojo.length; i++) {

        if (dojo[i] < 0) {
            dojo[i] = "Dojo"
        }
    }
    return dojo
}


var probando9 = fun12([-1, -3, 2]);
//console.log(probando9)