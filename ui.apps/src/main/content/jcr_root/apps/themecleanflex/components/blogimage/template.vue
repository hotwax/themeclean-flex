<template>
  <div class="main" v-bind:data-per-path="model.path">
    <div class="image" v-bind:style="{ 'background-image': 'url(' + model.image + ')' }">
      <div style="text-align: left; position: absolute; top: 20%; left: 5%; right: 50%;  color: black; ">
        <h2 class="heading" v-html="model.title"></h2>
      </div>
    </div>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

<style scoped>
  .main {
    width: 100%;
    margin: 0 auto;
    font-family: var(--font-sans);;
  }
  .image {
    margin: 20px 0px 20px 0px;
    height: 600px;
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
    position: relative;
  }
  .heading {
    font-style: normal;
    font-weight: normal;
    font-size: 48px;
    line-height: 77px;
  }
</style>

