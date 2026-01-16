let express  = require('express');
let app = express();
app.get('/', function(req, res){
    res.send('Rota com express');
});
app.listen(3000, function(){
    console.log("Porta: 3000");
});