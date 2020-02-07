<template>
  <div style="width: 1240px; height: 995px; margin: 0 auto; font-family: var(--font-sans);" v-bind:data-per-path="model.path">
    <div class="verticalset-left-banner" v-bind:style="{ 'background-image': 'url(' +model.cards[0].image+ ')' }">
        <h3 class="verticalset-banner-heading" v-html=" model.cards[0].title"></h3>
        <p class="verticalset-banner-text" v-html=" model.cards[0].text"></p>
        <br>
        <a href="#" class="verticalset-banner-button" v-if="model.showbutton == 'true' && model.cards[0].buttontext != ''" v-html="model.cards[0].buttontext"></a>
    </div>
    <div style="float: right; width: 770px; height: 1000px;">
      <div class="verticalset-right-top-banner" v-bind:style="{ 'background-image': 'url(' +model.cards[1].image+ ')' }">
        <h3 class="verticalset-banner-heading" v-html=" model.cards[1].title"></h3>
        <p class="verticalset-banner-text" v-html=" model.cards[1].text"></p>
        <br>
        <a href="#" class="verticalset-banner-button" v-if="model.showbutton == 'true' && model.cards[1].buttontext != ''" v-html="model.cards[1].buttontext"></a>
      </div>
      <div class="verticalset-right-top-banner" style="margin-left:14px;" v-bind:style="{ 'background-image': 'url(' +model.cards[2].image+ ')' }">
        <h3 class="verticalset-banner-heading" v-html=" model.cards[2].title"></h3>
        <p class="verticalset-banner-text" v-html=" model.cards[2].text"></p>
        <br>
        <a href="#" class="verticalset-banner-button" v-if="model.showbutton == 'true' && model.cards[2].buttontext != ''" v-html="model.cards[2].buttontext"></a>
      </div>
      <div class="verticalset-right-bottom-banner" v-bind:style="{ 'background-image': 'url(' +model.cards[3].image+ ')' }">
        <h3 class="verticalset-banner-heading" v-html=" model.cards[3].title"></h3>
        <p class="verticalset-banner-text" v-html=" model.cards[3].text"></p>
        <a href="#" class="verticalset-banner-button" v-if="model.showbutton == 'true' && model.cards[3].buttontext != ''" v-html="model.cards[3].buttontext"></a>
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
  .verticalset-left-banner{
    overflow:hidden;
    float: left;
    width: 450px; 
    border: 1px solid #607d8b; 
    height: 980px; 
    margin-left: 10px; 
    margin-top:5px; 
    background-position: center; 
    background-repeat: no-repeat; 
    background-size: cover;
    position: relative;
  }
  .verticalset-right-top-banner{
    overflow:hidden; 
    float: left; 
    width: 355px; 
    border: 1px solid #607d8b; 
    height: 710px;
    margin-left: 10px; 
    margin-top:5px; 
    background-position: center; 
    background-repeat: no-repeat; 
    background-size: cover; 
    position: relative;
  }
  .verticalset-right-bottom-banner{
    overflow:hidden; 
    float:left; 
    width: 724px; 
    border: 1px solid #607d8b; 
    height: 254px; 
    margin-left: 10px; 
    margin-top: 15px;  
    background-position: center; 
    background-repeat: no-repeat; 
    background-size: cover; 
    position: relative;
  }
  .verticalset-banner-heading{
    font-style: normal;
    font-weight: normal;
    font-size: 48px;
    line-height: 77px;
    margin-top: 8%;
    margin-left: 60px;
    margin-right: 30px;
  }
  .verticalset-banner-text{
    font-style: normal;
    font-weight: normal;
    font-size: 18px;
    line-height: 29px;
    margin-left: 70px;
    margin-right: 30px;
  }
  .verticalset-banner-button{
    background-color: black;
    border: none;
    color: white;
    padding: 15px 70px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    font-weight: bold;
    margin-left: 70px;
    margin-right: 30px;
  }
</style>
