.class final Lcom/google/android/gms/internal/ads/n30;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zn1<",
        "Lcom/google/android/gms/internal/ads/zf;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/l30;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/l30;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/n30;->a:Lcom/google/android/gms/internal/ads/l30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    check-cast p1, Lcom/google/android/gms/internal/ads/zf;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/n30;->a:Lcom/google/android/gms/internal/ads/l30;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/l30;->a(Lcom/google/android/gms/internal/ads/l30;)Lcom/google/android/gms/internal/ads/x80;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/x80;->a(Z)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/n30;->a:Lcom/google/android/gms/internal/ads/l30;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/l30;->a(Lcom/google/android/gms/internal/ads/l30;)Lcom/google/android/gms/internal/ads/x80;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/x80;->a(Z)V

    return-void
.end method
