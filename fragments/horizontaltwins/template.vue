<template>
  <div style="width: 80%; height: 700px; margin: 0 auto;" v-bind:data-per-path="model.path">
    <div style="float: left; width: 49%; border: 1px solid green; height: 350px; margin-top: 20px;">
      <h2 v-html="item.title"></h2>
    </div>
    <div style="float: right; width: 49%; border: 1px solid green; height: 350px; margin-top: 20px;">
      <h2></h2>
    </div>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

