<template>
  <themecleanflex-components-block v-bind:model="model">
    <div>
      <div class="first" style="  width: 100%;
  height: 700px;" v-for="(item,i) in model.cards" :key="i">
        <div class="second" style=" float: left;
  width: 50%;
  height:700px;
  margin-left:2px;">
          <div>
            <h2 v-html="item.title"></h2>
            <p v-html="item.text"></p>
          </div>
          <img style=" height: 590px;
  width: 100%;
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;" v-bind:src="item.image">
        </div>
        <div class="second-two" style=" float: right;
  width: 47%;
  height:700px;">
          <div>
            <div>
              <h2>hello all</h2>
              <p>hello all</p>
            </div>
            <img src="https://demo.vuestorefront.io/assets/ban1.jpg" style=" height: 250px;
  width: 100%;
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;">
          </div>
          <div>
            <div>
              <h2>hello all</h2>
              <p>hello all</p>
            </div>
            <img src="https://demo.vuestorefront.io/assets/ban1.jpg" style=" height: 250px;
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
        props: ['model']
    }
</script>

