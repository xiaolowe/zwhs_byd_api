<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>${title}</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
        <style type="text/css">
            body{
                font-family: "Helvetica Neue", "Hiragino Sans GB", Arial, sans-serif;
            }
            img{
            	width:100% !important;
            	height:auto;
            	display:block;
            }
            .container{
                padding: 20px 15px 15px;
            }
            .title{
                margin:0px 0px 10px 0px ;
                line-height: 1.4;
                font-weight: 400;
                font-size: 24px;
            }
            .times{
                color: #8c8c8c;
                margin-bottom: 18px;
                line-height: 20px;
            }
            .content{

            }
        </style>
    </head>
    <body>
        <div class="container">
            <h3 class="title">${title}</h3>
            <p class="times">${time}</p>
            <div class="content">
                ${content}
            </div>
        </div>
    </body>
</html>
