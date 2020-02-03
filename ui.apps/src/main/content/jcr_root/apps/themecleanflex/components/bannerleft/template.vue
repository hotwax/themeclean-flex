<template>
  <div style="width: 100%; margin: 0 auto; font-family: var(--font-sans);" v-bind:data-per-path="model.path">
    <div style=" margin: 20px 0px 20px 0px; height: 600px; background-position: center; background-repeat: no-repeat; background-size: cover; position: relative;" v-bind:style="{ 'background-image': 'url(' + model.image + ')' }">
      <div style="text-align: left; position: absolute; top: 20%; left: 5%; right: 50%;  color: black; ">
        <h2 class="bannerleft-heading" v-html="model.title"></h2>
        <p class="bannerleft-text" v-html="model.text"></p>
        <a href="#" class="bannerleft-button" v-if="model.showbutton == 'true'" v-html="model.buttontext"></a>
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
  .bannerleft-heading{
    font-style: normal;
    font-weight: normal;
    font-size: 48px;
    line-height: 77px;
  }
  .bannerleft-text{
    font-style: normal;
    font-weight: normal;
    font-size: 18px;
    line-height: 29px;
  }
  .bannerleft-button{
    background-color: black;
    border: none;
    color: white;
    padding: 15px 80px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    font-weight: bold;
  }
</style>

