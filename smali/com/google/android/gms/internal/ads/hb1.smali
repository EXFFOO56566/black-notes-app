.class final Lcom/google/android/gms/internal/ads/hb1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/xk1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/xk1<",
        "Lcom/google/android/gms/internal/ads/zf;",
        "Lcom/google/android/gms/internal/ads/kb1;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/gb1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gb1;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hb1;->a:Lcom/google/android/gms/internal/ads/gb1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/ads/zf;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hb1;->a:Lcom/google/android/gms/internal/ads/gb1;

    new-instance v1, Lcom/google/android/gms/internal/ads/kb1;

    new-instance v2, Lcom/google/android/gms/internal/ads/xf1;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zf;->l:Ljava/lang/String;

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/xf1;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/google/android/gms/internal/ads/kb1;-><init>(Lcom/google/android/gms/internal/ads/zf;Lcom/google/android/gms/internal/ads/uf1;Lcom/google/android/gms/internal/ads/ib1;)V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/gb1;->a(Lcom/google/android/gms/internal/ads/gb1;Lcom/google/android/gms/internal/ads/kb1;)Lcom/google/android/gms/internal/ads/kb1;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/hb1;->a:Lcom/google/android/gms/internal/ads/gb1;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/gb1;->b(Lcom/google/android/gms/internal/ads/gb1;)Lcom/google/android/gms/internal/ads/kb1;

    move-result-object p1

    return-object p1
.end method
