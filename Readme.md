Run mongodb

```
docker run --rm --name mongo-server -p 27017-27019:27017-27019 -v /opt/mongodb_volume:/com.neon.api.data/db -d mongo
```  
where `/opt/mongodb_volume` - your local com.neon.api.data volume for mongo  