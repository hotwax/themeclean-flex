<template>
  <div style="width: 1240px; height: 880px; margin: 0 auto; font-family: var(--font-sans);" v-bind:data-per-path="model.path">
    <div class="top-banner" v-bind:style="{ 'background-image': 'url(' +model.cards[0].image+ ')' }">
      <div style="text-align: left; position: absolute; top: 20%; left: 5%; right: 50%;  color: black; ">
        <h2 class="tgrid-top-banner-heading" v-html="model.cards[0].title"></h2>
        <p class="tgrid-top-banner-text" v-html="model.cards[0].text"></p>
        <a href="#" class="tgrid-top-banner-button" v-if="model.showbutton == 'true' && model.cards[0].buttontext != ''" v-html="model.cards[0].buttontext"></a>
      </div>
    </div>
    <div class="bottom-left-banner" v-bind:style="{ 'background-image': 'url(' +model.cards[1].image+ ')' }">
      <h3 class="tgrid-bottom-banner-heading" v-html=" model.cards[1].title"></h3>
        <p class="tgrid-bottom-banner-text" v-html=" model.cards[1].text"></p>
        <br>
        <a class="tgrid-bottom-banner-button" href="#" v-if="model.showbutton == 'true' && model.cards[1].buttontext != ''" v-html="model.cards[1].buttontext"></a>
    </div>
    <div class="bottom-right-banner" v-bind:style="{ 'background-image': 'url(' +model.cards[2].image+ ')' }">
      <h3 class="tgrid-bottom-banner-heading" v-html=" model.cards[2].title"></h3>
        <p class="tgrid-bottom-banner-text" v-html=" model.cards[2].text"></p>
        <br>
        <a href="#" class="tgrid-bottom-banner-button" v-if="model.showbutton == 'true' && model.cards[2].buttontext != ''" v-html="model.cards[2].buttontext"></a>
    </div>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

<style>
  .top-banner{
    float:left; 
    width: 1240px; 
    margin-top: 5px; 
    border: 1px solid #607d8b; 
    height: 413.33px;
    text-align:center; 
    background-position: center; 
    background-repeat: no-repeat; 
    background-size: cover;
    position: relative;
    overflow: hidden;
  }
  .tgrid-top-banner-heading{
    font-style: normal;
    font-weight: normal;
    font-size: 48px;
    line-height: 77px;
  }
  .tgrid-top-banner-text{
    font-style: normal;
    font-weight: normal;
    font-size: 18px;
    line-height: 29px;
  }
  .tgrid-top-banner-button{
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
  .tgrid-bottom-banner-heading{
    margin-top: 10%;
    font-style: normal;
    font-weight: normal;
    font-size: 48px;
    line-height: 77px;
    margin-left: 90px;
  }
  .tgrid-bottom-banner-text{
    font-style: normal;
    font-weight: normal;
    font-size: 18px;
    line-height: 29px;
    margin-left: 90px;
  }
  .tgrid-bottom-banner-button{
    background-color: black;
    border: none;
    color: white;
    padding: 15px 80px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    margin-left: 90px;
    font-weight: bold;
  }
  .bottom-left-banner{
    float: left; 
    width: 595px; 
    border: 1px solid #607d8b; 
    height: 420px; 
    margin-top: 20px;
    background-position: center; 
    background-repeat: no-repeat; 
    background-size: cover;
    position: relative;
    overflow: hidden;
  }
  .bottom-right-banner{
    float: right; 
    width: 595px; 
    border: 1px solid #607d8b; 
    height: 420px; 
    margin-top: 20px;
    background-position: center; 
    background-repeat: no-repeat; 
    background-size: cover;
    position: relative;
    overflow: hidden;
  }

</style>

