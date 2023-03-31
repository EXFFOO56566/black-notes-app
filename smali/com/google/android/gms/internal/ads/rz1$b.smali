.class public abstract Lcom/google/android/gms/internal/ads/rz1$b;
.super Lcom/google/android/gms/internal/ads/rz1;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/e12;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/rz1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/ads/rz1$b<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/ads/rz1<",
        "TMessageType;TBuilderType;>;",
        "Lcom/google/android/gms/internal/ads/e12;"
    }
.end annotation


# instance fields
.field protected zzhxy:Lcom/google/android/gms/internal/ads/gz1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/gz1<",
            "Lcom/google/android/gms/internal/ads/rz1$e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/rz1;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/gz1;->g()Lcom/google/android/gms/internal/ads/gz1;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rz1$b;->zzhxy:Lcom/google/android/gms/internal/ads/gz1;

    return-void
.end method


# virtual methods
.method final p()Lcom/google/android/gms/internal/ads/gz1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/gz1<",
            "Lcom/google/android/gms/internal/ads/rz1$e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz1$b;->zzhxy:Lcom/google/android/gms/internal/ads/gz1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gz1;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz1$b;->zzhxy:Lcom/google/android/gms/internal/ads/gz1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gz1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/gz1;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/rz1$b;->zzhxy:Lcom/google/android/gms/internal/ads/gz1;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/rz1$b;->zzhxy:Lcom/google/android/gms/internal/ads/gz1;

    return-object v0
.end method
