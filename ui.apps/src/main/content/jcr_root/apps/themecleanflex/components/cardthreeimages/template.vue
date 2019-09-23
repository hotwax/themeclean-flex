<template>
  <themecleanflex-components-block v-bind:model="model">
    <div>
      <div class="first" style="  width: 100%;
  height: 700px;">
        <div class="second" style=" float: left;
  width: 50%;
  height:700px;
  margin-left:2px;">
          <div>
            <h2 v-html=" model.cards[0].title"></h2>
            <p v-html="model.cards[0].text"></p>
          </div>
          <img style=" height: 590px;
  width: 100%;
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;" v-bind:src="model.cards[0].image">
        </div>
        <div class="second-two" style=" float: right;
  width: 47%;
  height:700px;">
          <div>
            <div>
            <h2 v-html="model.cards[1].title"></h2>
            <p v-html="model.cards[1].text"></p>
            </div>
            <img v-bind:src="model.cards[1].image" style=" height: 250px;
  width: 100%;
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;">
          </div>
          <div>
            <div>
               <h2 v-html="model.cards[2].title"></h2>
               <p v-html="model.cards[2].text"></p>
            </div>
            <img v-bind:src="model.cards[2].image" style=" height: 250px;
  width: 100%;
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;">
          </div>
        </div>
      </div>
    </div>
  </themecleanflex-components-block>
</template>

<script>
    export default {
        props: ['model'],

    }
</script>
