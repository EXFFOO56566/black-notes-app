.class public Lcom/google/android/gms/internal/ads/ix;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/ix$a;
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/ix$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ix$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ix;->a:Lcom/google/android/gms/internal/ads/ix$a;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/xi;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ix;->a:Lcom/google/android/gms/internal/ads/ix$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ix$a;->d()Lcom/google/android/gms/internal/ads/xi;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/ads/ie;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ix;->a:Lcom/google/android/gms/internal/ads/ix$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ix$a;->e()Lcom/google/android/gms/internal/ads/ie;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/ea;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ix;->a:Lcom/google/android/gms/internal/ads/ix$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ix$a;->f()Lcom/google/android/gms/internal/ads/ea;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/ads/internal/a;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ix;->a:Lcom/google/android/gms/internal/ads/ix$a;

    new-instance v7, Lcom/google/android/gms/ads/internal/a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ix$a;->a()Lcom/google/android/gms/internal/ads/es;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ix$a;->b()Lcom/google/android/gms/internal/ads/qp;

    move-result-object v3

    new-instance v4, Lcom/google/android/gms/internal/ads/si;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ix$a;->d()Lcom/google/android/gms/internal/ads/xi;

    move-result-object v1

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ads/si;-><init>(Lcom/google/android/gms/internal/ads/xi;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ix$a;->c()Lcom/google/android/gms/internal/ads/ak2;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ix$a;->e()Lcom/google/android/gms/internal/ads/ie;

    move-result-object v6

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/ads/internal/a;-><init>(Lcom/google/android/gms/internal/ads/es;Lcom/google/android/gms/internal/ads/qp;Lcom/google/android/gms/internal/ads/yi;Lcom/google/android/gms/internal/ads/ak2;Lcom/google/android/gms/internal/ads/ie;)V

    return-object v7
.end method
