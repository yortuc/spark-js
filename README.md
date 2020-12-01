# Spark-js

##### Readme driven development

Apache Spark bindings for Javascript (maybe TypeScript). 

##### What we have
- load js file, evaluate
- call spark apis from js and do the data conversion


##### Expected Api
```js
import {SparkSession} from 'spark-js';

const spark = SparkSession
                    .builder()
                    .appName("deneme")
                    .master("local[1]")
                    .getOrCreate()

const dfJson = spark.read.json("hdfs://some-data.json")

await const jsDict = dfJson.collect()

console.log(jsDict)
```