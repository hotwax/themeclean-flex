<template>
  <div style="width: 83%; height: 715px; margin: 0 auto; font-family: var(--font-sans);" v-bind:data-per-path="model.path">
    <div class="horizontal-banner1" v-bind:style="{ 'background-image': 'url(' +model.cards[0].image+ ')' }">
      <h3 class="verticalbannergrid-heading" v-html=" model.cards[0].title"></h3>
      <p class="verticalbannergrid-text" v-html=" model.cards[0].text"></p>
      <br>
      <a href="#" class="verticalbannergrid-button" v-if="model.showbutton == 'true' && model.cards[0].buttontext != ''" v-html="model.cards[0].buttontext"></a>
    </div>
    <div class="horizontal-banner2" style="margin-left: 20px;" v-bind:style="{ 'background-image': 'url(' +model.cards[1].image+ ')' }">
      <h3 class="verticalbannergrid-heading" v-html=" model.cards[1].title"></h3>
      <p class="verticalbannergrid-text" v-html=" model.cards[1].text"></p>
      <br>
      <a href="#" class="verticalbannergrid-button" v-if="model.showbutton == 'true'  && model.cards[1].buttontext != ''" v-html="model.cards[1].buttontext"></a>
    </div>
    <div style="float: left; width: 40%; height: 700px; margin-left: 20px;">
      <div class="vertical-banner" v-bind:style="{ 'background-image': 'url(' +model.cards[2].image+ ')' }">
        <h3 class="verticalbannergrid-heading" v-html=" model.cards[2].title"></h3>
        <p class="verticalbannergrid-text" v-html=" model.cards[2].text"></p>
        <br>
        <a href="#" class="verticalbannergrid-button" v-if="model.showbutton == 'true' && model.cards[2].buttontext != ''" v-html="model.cards[2].buttontext"></a>
      </div>
      <div class="vertical-banner" style="margin-top: 8px;" v-bind:style="{ 'background-image': 'url(' +model.cards[3].image+ ')' }">
        <h3 class="verticalbannergrid-heading" v-html=" model.cards[3].title"></h3>
        <p class="verticalbannergrid-text" v-html=" model.cards[3].text"></p>
        <br>
        <a href="#" class="verticalbannergrid-button" v-if="model.showbutton == 'true' && model.cards[3].buttontext != ''" v-html="model.cards[3].buttontext"></a>
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
  .horizontal-banner1{
    float: left; 
    width: 24%; 
    border: 1px solid #607d8b; 
    height: 705px;
    margin-top: 4px;
    background-position: center; 
    background-repeat: no-repeat; 
    background-size: cover;
    position: relative;
    overflow: hidden;
  }
  .horizontal-banner2{
    float: left; 
    width: 31%; 
    border: 1px solid #607d8b; 
    height: 705px;
    margin-top: 4px;
    background-position: center; 
    background-repeat: no-repeat; 
    background-size: cover;
    position: relative;
    overflow: hidden;
  }
  .vertical-banner{
    width: auto; 
    border: 1px solid #607d8b; 
    height: 349px;
    margin-top: 4px; 
    background-position: center; 
    background-repeat: no-repeat; 
    background-size: cover;
    position: relative;
    overflow: hidden;

  }
  .verticalbannergrid-text{
    font-style: normal;
    font-weight: normal;
    font-size: 18px;
    line-height: 29px;
    margin-left: 20px;
    margin-right: 15px;
  }
  .verticalbannergrid-button{
    background-color: black;
    border: none;
    color: white;
    padding: 15px 80px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin-left: 20px;
    font-weight: bold;
  }
  .verticalbannergrid-heading{
    margin-top: 15%;
    font-weight: normal;
    font-size: 48px;
    line-height: 77px;
    margin-left: 20px;
    margin-right: 15px;
  }

</style>

