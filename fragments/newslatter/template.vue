<template>
  <themecleanflex-components-block v-bind:model="model">
    <div style=" width: 80%; margin: 0 auto; font-family: Playfair Display;">
      <div style="text-align: left; position: absolute; top: 5%; left: 10%; right: 50%; font-style: normal; font-weight: normal; color: black;">
        <h2 style=" font-size: 36px; line-height: 48px; " v-html="model.title"></h2>
        <p style=" font-size: 18px; line-height: 29px;" v-html="model.text"></p>
      </div>
      <div style="margin-top: 6%;">
        <a href="#" style="background-color:#5ECE7B;; border: none; color: white; padding: 15px 80px; text-align: center; text-decoration: none; font-size: 16px; margin: 4px 6px; font-weight: bold; float:right;"
        v-html="model.buttontext"></a>
      </div>
    </div>
  </themecleanflex-components-block>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

