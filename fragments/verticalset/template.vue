<template>
  <div style="width: 100%; height: 700px;" v-bind:data-per-path="model.path">
    <div style="float: left; width: 30%; border: 1px solid red; height: 700px; margin-left: 20px;">
      <h2 v-html="item.title"></h2>
      <p v-html="item.text"></p>
    </div>
    <div style="float: right; width: 68%; border: 1px solid red; height: 700px;">
      <div style="float: left; width: 25%; border: 1px solid green; height: 350px; margin-left: 10px;">
        <h2></h2>
        <p></p>
      </div>
      <div style="float: left; width: 25%; border: 1px solid green; height: 350px; margin-left: 10px;">
        <h2></h2>
        <p></p>
      </div>
      <div style="float: left; width: 25%; border: 1px solid green; height: 350px; margin-left: 10px;">
        <h2></h2>
        <p></p>
      </div>
      <div style=" float:left; width: 77%; border: 1px solid green; height: 340px; margin-left: 10px; margin-top: 5px;">
        <h2></h2>
        <p></p>
      </div>
    </div>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

