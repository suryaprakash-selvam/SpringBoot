
const express = require('express')
const router= express.Router()
const feild =require('../models/field')
// var dateTime = require('node-datetime');
// var dt = dateTime.create();

router.get('/', async(req,res)=>{
    console.log('data is called')
    try{
        
       const allfeild= await feild.findByName()

       res.json(allfeild)
    }catch(err){
        res.send('error' , err)
    }
})


router.post('/',async(req,res) =>{
  var addfeild=new feild(
    {

     
    Name:{
      name:req.body.name,
    }
  
    }
  )

  console.log("checking "+ addfeild) ;
  try{
      const result = await addfeild.save()
    res.json(result)
  }catch(err){
      res.send('error'+err)
  }
})


module.exports=router