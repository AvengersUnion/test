$(function(){
	/*$.ajax({
    		"type":"get",
    		"url":"/jiaohu",
    		"success":function(data){*/
    		$('#container').jstree({
  "core":{
    "check_callback" : function (operation, node, parent, position, more) {
      
      if(operation === "copy_node" || operation === "move_node") {
        if(parent.id === "#") {
          return false; // prevent moving a child above or below the root
        }
      }
      return true; // allow everything else
    },
   data: [{"id":1,"text":"cx"}],
  },
  "plugins" : ["dnd","contextmenu"],
 "contextmenu":{  
            select_node:false,  
            show_at_node:true,  
            items:{  
                "新建文件夹":{    
                    "label":"新建文件夹",    
                    "icon": "glyphicon glyphicon-plus",  
                    "action":function(data){
                    			 var inst = $.jstree.reference(data.reference),  
                        obj = inst.get_node(data.reference);
                        console.log(obj)
                    inst.create_node(obj, {}, "last", function (new_node) {  
                        try {  
                            new_node.text="新建文件夹";  
                            inst.edit(new_node);
                            
                        } catch (ex) {  
                            setTimeout(function () { inst.edit(new_node); },0);  
                        }  
                    });  
                       
                    }    
                },  
                "重命名":{  
                    "separator_before"  : false,  
                    "separator_after"   : false,  
                    "_disabled"         : false, //(this.check("rename_node", data.reference, this.get_parent(data.reference), "")),  
                    "label"             : "重命名",  
                    "shortcut_label"    : 'F2',  
                    "icon"              : "glyphicon glyphicon-leaf",  
                    "action"            : function (data) {
                    	 var inst = $.jstree.reference(data.reference),  
                            obj = inst.get_node(data.reference); 
                           $("#content").next().html("ghfttt")
                    			inst.edit(obj);
                    			console.log(obj)
                    }  
                },  
                "删除文件夹":{  
                    "separator_before"  : false,  
                    "icon"              : false,  
                    "separator_after"   : false,  
                    "_disabled"         : false, //(this.check("delete_node", data.reference, this.get_parent(data.reference), "")),  
                    "label"             : "删除文件夹",  
                    "icon"              :"glyphicon glyphicon-remove",  
                    "action"            : function (data) {
                    	var inst = $.jstree.reference(data.reference),
                        obj = inst.get_node(data.reference);
                    		if(inst.is_selected(obj)) {
                            inst.delete_node(inst.get_selected());  
                        }  
                        else {  
                            inst.delete_node(obj);  
                        } 
                        
                    }  
                },
               "添加文件":{    
                    "label":"添加文件",    
                    "icon":"glyphicon glyphicon-plus",  
                    "action":function(data){
                    	$("input[type=file]").trigger("click")
                    	setTimeout(function(){
                    		  var inst = $.jstree.reference(data.reference),  
                        obj = inst.get_node(data.reference);  
                    inst.create_node(obj, {}, "last", function (new_node) {  
                        try {  
                            new_node.text=$("input[type=file]").val();  
                            inst.edit(new_node);  
                        }catch (ex){  
                            setTimeout(function () { inst.edit(new_node); },0);  
                        }  
                    });  
                    	},0)
                      
                    }    
                },  
            }  
          },
          
}).on("rename_node.jstree",function(e,data){
	console.log(data.node.id+","+data.node.text)
	$.ajax({
		    "type":"get",
    	    "url":"/jiaohu",
    		"data":{"id":data.node.id,"name":data.node.text},
    		"success":function(data){
    			
    		}
    })
}).on("create_node.jstree",function(e,data){
	console.log(data.node.id+","+data.node.text)
	$.ajax({
		    "type":"get",
    	    "url":"/jiaohu",
    		"data":{"id":data.node.id,"name":data.node.text},
    		"success":function(data){
    			
    		}
    })
}).on("delete_node.jstree",function(e,data){
	console.log(data.node.id+","+data.node.text)
	$.ajax({
		    "type":"get",
    	    "url":"/jiaohu",
    		"data":{"id":data.node.id,"name":data.node.text},
    		"success":function(data){
    			
    		}
    })
}).one("activate_node.jstree",function(obj,e){
	console.log(e.node.id+","+e.node.text)
	$.ajax({
		    "type":"get",
    	    "url":"/jiaohu",
    		"data":{"id":e.node.id,"name":e.node.text},
    		"success":function(data){
    			
    		}
    })
})

    		/*}*/
    		/*})*/
	
 
 })