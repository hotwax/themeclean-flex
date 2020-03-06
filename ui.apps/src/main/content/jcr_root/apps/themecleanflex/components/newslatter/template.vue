<template>
    <div style=" width: 100%; height:250px; margin: 0 auto; font-family: var(--font-sans);" v-bind:data-per-path="model.path">
      <div style="width: 100%; height: 250px; background-position: center; background-repeat: no-repeat; background-size: cover; position: relative;" v-bind:style="{ 'background-image': 'url(' + model.image + ')' }">
        <div style=" margin-top: 80px; text-align: left; position: absolute; left: 5%; right: 50%; font-style: normal; font-weight: normal; color: black;">
          <h2 style=" font-size: 36px; line-height: 48px; " v-html="model.title"></h2>
          <p style=" font-size: 18px; line-height: 29px;" v-html="model.text"></p>
        </div>
        <div>
          <div style="margin-top: 90px; float: right; display: inline-block;">
            <a href="#" class="newslatter-button" v-html="model.buttontext"></a>
            </div>
          </div>
       </div>
    </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

<style>
  .newslatter-button{
    background-color:#5ECE7B;
    border: none; 
    color: white; 
    padding: 15px 80px; 
    text-align: center; 
    text-decoration: none; 
    font-size: 16px; 
    margin: 4px 500px; 
    font-weight: bold; 
    float:right; 
    margin-right:100px;
  }

</style>

