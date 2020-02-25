<template>
  <div class="main" v-bind:data-per-path="model.path">
    <div class="hero-image">
      <div class="hero-text">
        <h2 style="font-size:50px"></h2>
        <p></p>
        <button></button>
      </div>
    </div>
  </div>
</template>

<script>
    export default {
        props: ['model']
    }
</script>

