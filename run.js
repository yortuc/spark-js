var SparkJS = Java.type("Start.SparkJS");
var spark = new SparkJS();

print("reading file");
var jsonFile = spark.readJson("data.json");

print("convert Java type result to js");
var jsArray = Java.from(jsonFile);
print(jsArray);

// Promise is not supported by nashorn
//
// var promiseA = new Promise(
//     function resolve (data){
//         print("resolved");
//     },
//     function reject(){
//         print("rejected");
//     });

