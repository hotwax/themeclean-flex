<template>
  <div style="width: 80%; height: 700px; margin: 0 auto;" v-bind:data-per-path="model.path">
    <div style=" float:left; width: 100%; margin: 0 auto; border: 1px solid green; height: 340px;">
      <h2 v-html="item.title"></h2>
      <p v-html="item.text"></p>
    </div>
    <div style="float: left; width: 49%; border: 1px solid green; height: 350px; margin-top: 20px;">
      <h2></h2>
      <p></p>
    </div>
    <div style="float: right; width: 49%; border: 1px solid green; height: 350px; margin-top: 20px;">
      <h2></h2>
      <p></p>
    </div>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

