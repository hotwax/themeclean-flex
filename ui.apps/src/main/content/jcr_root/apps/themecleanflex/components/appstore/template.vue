<template>
  <div class="app" v-bind:data-per-path="model.path">
    <div class="app-image" v-bind:style="{ 'background-image': 'url(' + model.image + ')' }">
      <div class="app-heading">
        <h2 style="margin-right: 60%;" v-html="model.title"></h2>
        <br>
        <img style="position: absolute; width: 174px; height: 56.86px; " src="/content/assets/themecleanflex/notnaked/applestore.png">
        <img style="position: absolute; width: 174px; height: 56.86px; margin-left:200px; " src="/content/assets/themecleanflex/notnaked/playstore.png">
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
  .app{
    width: 100%;
    height: 600px;
  }
  .app-image{
    height: 599px;
    background-repeat: no-repeat;
    background-size: cover;
    
  }
  .app-heading{
    position: relative;
    top: 20%;
    left: 10%;     
    color: black;
    font-family: var(--font-sans);
  }
</style>

