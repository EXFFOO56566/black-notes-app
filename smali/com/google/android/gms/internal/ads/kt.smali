.class final synthetic Lcom/google/android/gms/internal/ads/kt;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lb/c/b/a/d/a;


# direct methods
.method constructor <init>(Lb/c/b/a/d/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/kt;->b:Lb/c/b/a/d/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/kt;->b:Lb/c/b/a/d/a;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ht;->b(Lb/c/b/a/d/a;)V

    return-void
.end method
